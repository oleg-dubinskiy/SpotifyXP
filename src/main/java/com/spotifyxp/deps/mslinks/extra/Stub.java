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
package com.spotifyxp.deps.mslinks.extra;

import com.spotifyxp.deps.io.ByteReader;
import com.spotifyxp.deps.io.ByteWriter;
import com.spotifyxp.deps.mslinks.Serializable;

import java.io.IOException;

public class Stub implements Serializable {

    private final int sign;
    private final byte[] data;

    public Stub(ByteReader br, int sz, int sgn) throws IOException {
        int len = sz - 8;
        sign = sgn;
        data = new byte[len];
        for (int i = 0; i < len; i++)
            data[i] = (byte) br.read();
    }

    @Override
    public void serialize(ByteWriter bw) throws IOException {
        bw.write4bytes(data.length + 8);
        bw.write4bytes(sign);
        bw.write(data);
    }

}
