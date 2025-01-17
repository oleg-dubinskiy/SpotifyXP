/*
	https://github.com/BlackOverlord666/mslinks
	
	Copyright (c) 2015 Dmitrii Shamrikov

	Licensed under the WTFPL
	You may obtain a copy of the License at
 
	http://www.wtfpl.net/about/
 
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*/
package com.spotifyxp.deps.mslinks;

import com.spotifyxp.deps.mslinks.data.GUID;

public class UnsupportedCLSIDException extends ShellLinkException {
    public UnsupportedCLSIDException(GUID clsid) {
        super(clsid.toString());
    }
}
