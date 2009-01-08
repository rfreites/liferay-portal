<%
/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
%>

<%@ page import="com.liferay.portal.kernel.servlet.HttpHeaders" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%

// According to http://www.webmasterworld.com/forum91/3087.htm a semicolon in
// the URL for a meta-refresh tag does not work in IE 6.

// To work around this issue, we use a URL without a session id for meta-refresh
// and rely on the load event on the body element to properly rewrite the URL.

String urlHome = PortalUtil.getURLHome(request);

if (!request.isRequestedSessionIdFromCookie()) {
	urlHome = PortalUtil.getURLWithSessionId(urlHome, session.getId());
}

response.setHeader(HttpHeaders.LOCATION, urlHome);
response.setHeader(HttpHeaders.CONNECTION, HttpHeaders.CONNECTION_CLOSE_VALUE);

response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
%>

<html>
<head>
	<title></title>
	<meta content="1; url=<%= urlHome %>" http-equiv="refresh" />
</head>

<body onload="javascript: location.replace('<%= urlHome %>')">

</body>

</html>