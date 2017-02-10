<#import "/spring.ftl" as spring />
<#--
 * Copyright 2011 Alan Shaw
 *
 * http://www.freestyle-developments.co.uk
 * https://github.com/alanshaw/pagination-freemarker-macros
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations
 * under the License.
-->

<#--
 * Pagination macros.
 *
 * The use of these macros requires either an model attribute called "paginationData" to be set or if you want to call
 * it something else, or have more than one list of items that needs paginating, you can use the "bind" macro to set
 * the current pagination data that subsequent calls to other macros will use.
 *
 * Either way, the pagination data object is expected to contain (at least) the following properties:
 *
 * pageIndex -> The current page number
 * pageSize -> The number of items in each page
 * pagesAvailable -> The total number of pages
 *
 *
 * Page links consist of the current request url and a query string that looks like:
 *
 * ?field=&page=&size=&direction=
 *
 *
 * Localization messages are looked up using the following keys:
 *
 * pagination.first -> Text for the first page link (default "« First")
 * pagination.last -> Text for the last page link (default "Last »")
 * pagination.next -> Text for the next page link (default "Next »")
 * pagination.previous -> Text for the previous page link (default "« Previous")
 * pagination.counter -> Text for the page counter (default "{0} of {1}")
-->

<#--
 * Assign the current data to the object called "paginationData" if set.
-->
<#if paginationData??>
    <#assign data = paginationData />
</#if>

<#--
 * Bind pagination data to the current data set these macros are using.
-->
<#macro bind paginationData>
    <#assign data = paginationData />
</#macro>

<#--
 * Outputs the first page link
-->
<#macro first>
    <#if (data.pageIndex < 1)>
        <#local classAttr = "class=\"disabled\"" />
    <#else>
        <#local classAttr = "" />
    </#if>
    <#local text>
        <@spring.messageText "pagination.first", "« First" />
    </#local>
    <@page 0, text, classAttr/>
</#macro>

<#--
 * Outputs the last page link
-->
<#macro last>
    <#if (data.pageIndex >= data.pagesAvailable - 1)>
        <#local classAttr = "class=\"disabled\"" />
    <#else>
        <#local classAttr = "" />
    </#if>
    <#local text>
        <@spring.messageText "pagination.last", "Last »" />
    </#local>
    <@page data.pagesAvailable - 1, text, classAttr/>
</#macro>

<#--
 * Outputs the next page link
-->
<#macro next>
    <#if (data.pageIndex >= data.pagesAvailable - 1)>
        <#local pageIndex = data.pageIndex />
        <#local classAttr = "class=\"disabled\"" />
    <#else>
        <#local pageIndex = data.pageIndex + 1 />
        <#local classAttr = "" />
    </#if>
    <#local text>
        <@spring.messageText "pagination.next", "Next »" />
    </#local>
    <@page pageIndex, text, classAttr/>
</#macro>

<#--
 * Outputs the previous page link
-->
<#macro previous>
    <#if (data.pageIndex < 1)>
        <#local pageIndex = data.pageIndex />
        <#local classAttr = "class=\"disabled\"" />
    <#else>
        <#local pageIndex = data.pageIndex - 1 />
        <#local classAttr = "" />
    </#if>
    <#local text>
        <@spring.messageText "pagination.previous", "« Previous" />
    </#local>
    <@page pageIndex, text, classAttr/>
</#macro>

<#--
 * Outputs the page numbers and links
 *
 * @param maxPages (Optional) The maximum number of page links to show
 * @param separator (Optional) The separator between page links
-->
<#macro numbers maxPages = 9 separator = " | ">
    <#local pagesBefore = (maxPages / 2)?floor />
    <#local pagesAfter = (maxPages / 2)?floor />
    <#if maxPages % 2 == 0>
        <#local pagesBefore = pagesBefore - 1 />
    </#if>
    <#local pageNumMin = data.pageIndex - pagesBefore />
    <#local pageNumMax = data.pageIndex + pagesBefore />
    <#if (pageNumMin < 0)>
        <#local pageNumMax = pageNumMax + (0 - pageNumMin) />
        <#local pageNumMin = 0 />
    </#if>
    <#if (pageNumMax >= data.pagesAvailable)>
        <#local pageNumMin = pageNumMin - (pageNumMax - data.pagesAvailable) />
        <#local pageNumMax = data.pagesAvailable - 1 />
        <#if (pageNumMin < 0)>
            <#local pageNumMin = 0 />
        </#if>
        <#if (pageNumMax < 0)>
            <#local pageNumMax = 0 />
        </#if>
    </#if>
    <#list pageNumMin..pageNumMax as pageIndex>
        <#if pageIndex == data.pageIndex>
            <#local classAttr = "class=\"selected\"" />
        <#else>
            <#local classAttr = "" />
        </#if>
        <@page pageIndex, "", classAttr/><#if pageIndex_has_next>${separator}</#if>
    </#list>
</#macro>

<#--
 * Outputs a link to a specific page.
 *
 * @param pageIndex To page number ot link to
 * @param text (Optional) The link text (Defaults to page number if not set)
 * @param attributes (Optional) Any HTML attributes to add to the element
-->
<#macro page pageIndex text = "" attributes = "">
    <#if text == "">
        <#local text = (pageIndex + 1)?string />
    </#if>
    <#if (attributes != "" && attributes?starts_with(" ") == false)>
        <#local attributes = " " + attributes />
    </#if>
    <a href="?pageindex=${pageIndex}&amp;pagesize=${data.pageSize}&amp;pagesavailable=${data.pagesAvailable}"${attributes}>${text?html}</a>
</#macro>

<#--
 * Outputs the current page number and the total pages
-->
<#macro counter>
    <#if data.pagesAvailable == 0>
        <#local pagesAvailable = 1 />
    <#else>
        <#local pagesAvailable = data.pagesAvailable />
    </#if>
    <@spring.messageArgsText "pagination.counter", [data.pageIndex + 1, pagesAvailable], "{0} of {1}" />
</#macro>