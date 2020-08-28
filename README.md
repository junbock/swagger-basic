<!DOCTYPE html>
<!-- saved from url=(0032)http://127.0.0.1/swagger-ui.html -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  
  <title>Swagger UI</title>
  <link rel="stylesheet" type="text/css" href="./Swagger UI_files/springfox.css">
  <link rel="stylesheet" type="text/css" href="./Swagger UI_files/swagger-ui.css">
  <link rel="icon" type="image/png" href="http://127.0.0.1/webjars/springfox-swagger-ui/favicon-32x32.png?v=2.8.0-SNAPSHOT" sizes="32x32">
  <link rel="icon" type="image/png" href="http://127.0.0.1/webjars/springfox-swagger-ui/favicon-16x16.png?v=2.8.0-SNAPSHOT" sizes="16x16">
  <style>
    html
    {
      box-sizing: border-box;
      overflow: -moz-scrollbars-vertical;
      overflow-y: scroll;
    }
    *,
    *:before,
    *:after
    {
      box-sizing: inherit;
    }

    body {
      margin:0;
      background: #fafafa;
    }
  </style>
</head>

<body>

<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" style="position:absolute;width:0;height:0">
  <defs>
    <symbol viewBox="0 0 20 20" id="unlocked">
      <path d="M15.8 8H14V5.6C14 2.703 12.665 1 10 1 7.334 1 6 2.703 6 5.6V6h2v-.801C8 3.754 8.797 3 10 3c1.203 0 2 .754 2 2.199V8H4c-.553 0-1 .646-1 1.199V17c0 .549.428 1.139.951 1.307l1.197.387C5.672 18.861 6.55 19 7.1 19h5.8c.549 0 1.428-.139 1.951-.307l1.196-.387c.524-.167.953-.757.953-1.306V9.199C17 8.646 16.352 8 15.8 8z"></path>
    </symbol>

    <symbol viewBox="0 0 20 20" id="locked">
      <path d="M15.8 8H14V5.6C14 2.703 12.665 1 10 1 7.334 1 6 2.703 6 5.6V8H4c-.553 0-1 .646-1 1.199V17c0 .549.428 1.139.951 1.307l1.197.387C5.672 18.861 6.55 19 7.1 19h5.8c.549 0 1.428-.139 1.951-.307l1.196-.387c.524-.167.953-.757.953-1.306V9.199C17 8.646 16.352 8 15.8 8zM12 8H8V5.199C8 3.754 8.797 3 10 3c1.203 0 2 .754 2 2.199V8z"></path>
    </symbol>

    <symbol viewBox="0 0 20 20" id="close">
      <path d="M14.348 14.849c-.469.469-1.229.469-1.697 0L10 11.819l-2.651 3.029c-.469.469-1.229.469-1.697 0-.469-.469-.469-1.229 0-1.697l2.758-3.15-2.759-3.152c-.469-.469-.469-1.228 0-1.697.469-.469 1.228-.469 1.697 0L10 8.183l2.651-3.031c.469-.469 1.228-.469 1.697 0 .469.469.469 1.229 0 1.697l-2.758 3.152 2.758 3.15c.469.469.469 1.229 0 1.698z"></path>
    </symbol>

    <symbol viewBox="0 0 20 20" id="large-arrow">
      <path d="M13.25 10L6.109 2.58c-.268-.27-.268-.707 0-.979.268-.27.701-.27.969 0l7.83 7.908c.268.271.268.709 0 .979l-7.83 7.908c-.268.271-.701.27-.969 0-.268-.269-.268-.707 0-.979L13.25 10z"></path>
    </symbol>

    <symbol viewBox="0 0 20 20" id="large-arrow-down">
      <path d="M17.418 6.109c.272-.268.709-.268.979 0s.271.701 0 .969l-7.908 7.83c-.27.268-.707.268-.979 0l-7.908-7.83c-.27-.268-.27-.701 0-.969.271-.268.709-.268.979 0L10 13.25l7.418-7.141z"></path>
    </symbol>


    <symbol viewBox="0 0 24 24" id="jump-to">
      <path d="M19 7v4H5.83l3.58-3.59L8 6l-6 6 6 6 1.41-1.41L5.83 13H21V7z"></path>
    </symbol>

    <symbol viewBox="0 0 24 24" id="expand">
      <path d="M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z"></path>
    </symbol>

  </defs>
</svg>

<div id="swagger-ui"><section data-reactroot="" class="swagger-ui swagger-container"><div class="topbar"><div class="wrapper"><div class="topbar-wrapper"><a href="http://127.0.0.1/swagger-ui.html#" class="link"><img height="30" width="30" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAMAAAAM7l6QAAAAYFBMVEUAAABUfwBUfwBUfwBUfwBUfwBUfwBUfwBUfwBUfwBUfwBUfwBUfwBUfwBUfwB0lzB/n0BfhxBpjyC0x4////+qv4CJp1D09++ft3C/z5/K16/U379UfwDf58/q79+Ur2D2RCk9AAAAHXRSTlMAEEAwn9//z3Agv4/vYID/////////////////UMeji1kAAAD8SURBVHgBlZMFAoQwDATRxbXB7f+vPKnlXAZn6k2cf3A9z/PfOC8IIYni5FmmABM8FMhwT17c9hnhiZL1CwvEL1tmPD0qSKq6gaStW/kMXanVmAVRDUlH1OvuuTINo6k90Sxf8qsOtF6g4ff1osP3OnMcV7d4pzdIUtu1oA4V0DZoKmxmlEYvtDUjjS3tmKmqB+pYy8pD1VPf7jPE0I40HHcaBwnue6fGzgyS5tXIU96PV7rkDWHNLV0DK4FkoKmFpN5oUnvi8KoeA2/JXsmXQuokx0siR1G8tLkN6eB9sLwJp/yymcyaP/TrP+RPmbMMixcJVgTR1aUZ93oGXsgXQAaG6EwAAAAASUVORK5CYII=" alt="Swagger UI"><span>swagger</span></a><form class="download-url-wrapper"><label class="select-label" for="select"><span>Select a spec</span><select id="select"><option value="http://127.0.0.1/v2/api-docs">default</option></select></label></form></div></div></div><div class="swagger-ui"><div><!-- react-empty: 22 --><div class="information-container wrapper"><section class="block col-12"><div class="info"><hgroup class="main"><h2 class="title"><!-- react-text: 35 -->Payroll API Documentation<!-- /react-text --><small><pre class="version"><!-- react-text: 38 --> <!-- /react-text --><!-- react-text: 39 -->1.0.0<!-- /react-text --><!-- react-text: 40 --> <!-- /react-text --></pre></small></h2><pre class="base-url"><!-- react-text: 42 -->[ Base URL: <!-- /react-text --><!-- react-text: 43 -->127.0.0.1<!-- /react-text --><!-- react-text: 44 -->/<!-- /react-text --><!-- react-text: 45 --> ]<!-- /react-text --></pre><a target="_blank" href="http://127.0.0.1/v2/api-docs"><span class="url"><!-- react-text: 48 --> <!-- /react-text --><!-- react-text: 49 -->http://127.0.0.1/v2/api-docs<!-- /react-text --><!-- react-text: 50 --> <!-- /react-text --></span></a></hgroup><div class="description"><div class="markdown"><p>employee를 관리하는 api</p>
</div></div><div><div><a href="https://search.naver.com/search.naver?sm=top_hty&amp;fbm=0&amp;ie=utf8&amp;query=%EC%97%84%EC%9E%AC%EC%8B%9D" target="_blank"><!-- react-text: 56 -->엄재식<!-- /react-text --><!-- react-text: 57 --> - Website<!-- /react-text --></a></div><a href="mailto:skokk33@gmail.com">Send email to 엄재식</a></div></div></section></div><div class="wrapper"><section class="block col-12 block-desktop col-12-desktop"><div><div class="opblock-tag-section"><h4 class="opblock-tag" id="operations-tag-EmployeeController_사용_설명서_v1"><a class="nostyle" href="http://127.0.0.1/swagger-ui.html#/EmployeeController%20%EC%82%AC%EC%9A%A9%20%EC%84%A4%EB%AA%85%EC%84%9C%20v1"><span>EmployeeController 사용 설명서 v1</span></a><small><div class="markdown"><p>Employee Controller</p>
</div></small><div></div><button class="expand-operation" title="Expand operation"><svg class="arrow" width="20" height="20"><use href="#large-arrow" xlink:href="#large-arrow"></use></svg></button></h4><noscript></noscript></div></div></section></div><div class="wrapper"><section class="block col-12 block-desktop col-12-desktop"><section class="models"><h4><span>Models</span><svg width="20" height="20"><use xlink:href="#large-arrow"></use></svg></h4><noscript></noscript></section></section></div></div></div><div class="wrapper"><section class=""><!-- react-empty: 15 --></section></div></section></div>

<script src="./Swagger UI_files/swagger-ui-bundle.js.다운로드"> </script>
<script src="./Swagger UI_files/swagger-ui-standalone-preset.js.다운로드"> </script>
<script src="./Swagger UI_files/springfox.js.다운로드"> </script>



</body></html>
