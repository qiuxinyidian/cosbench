/**

Copyright 2013 Intel Corporation, All Rights Reserved.
Copyright 2019 OpenIO Corporation, All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/
package com.intel.cosbench.client.S3Stor;

public interface S3Constants {
    // --------------------------------------------------------------------------
    // CONNECTION
    // --------------------------------------------------------------------------

    String CONN_TIMEOUT_KEY = "timeout";
    int CONN_TIMEOUT_DEFAULT = 30000;
    // --------------------------------------------------------------------------
    // ENDPOINT
    // --------------------------------------------------------------------------
    String ENDPOINT_KEY = "endpoint";
    String ENDPOINT_DEFAULT = "http://s3.amazonaws.com";

    // --------------------------------------------------------------------------
    // AUTHENTICATION
    // --------------------------------------------------------------------------

    String AUTH_USERNAME_KEY = "accesskey";
    String AUTH_USERNAME_DEFAULT = "";

    String AUTH_PASSWORD_KEY = "secretkey";
    String AUTH_PASSWORD_DEFAULT = "";

    // --------------------------------------------------------------------------
    // CLIENT CONFIGURATION
    // --------------------------------------------------------------------------
    String PROXY_HOST_KEY = "proxyhost";
    String PROXY_PORT_KEY = "proxyport";

    // MAX CONNECTIONS DEFAULT
    // --------------------------------------------------------------------------
    String MAX_CONNECTIONS = "max_connections";
    int MAX_CONNECTIONS_DEFAULT = 50;

    // --------------------------------------------------------------------------
    // PATH STYLE ACCESS
    // --------------------------------------------------------------------------
    String PATH_STYLE_ACCESS_KEY = "path_style_access";
    boolean PATH_STYLE_ACCESS_DEFAULT = false;

    // --------------------------------------------------------------------------
    // CONTEXT NEEDS FROM AUTH MODULE
    // --------------------------------------------------------------------------
    String S3CLIENT_KEY = "s3client";

}
