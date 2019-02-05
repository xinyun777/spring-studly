/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.http.codec.json;

import java.util.List;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.util.MimeType;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Decode a byte stream into JSON and convert to Object's with Jackson 2.9,
 * leveraging non-blocking parsing.
 *
 * @author Sebastien Deleuze
 * @author Rossen Stoyanchev
 * @author Greg Turnquist
 * @since 5.0
 * @see Jackson2JsonEncoder
 */
public class Jackson2JsonDecoder extends AbstractJackson2Decoder {

	public Jackson2JsonDecoder() {
		super(Jackson2ObjectMapperBuilder.json().build());
	}

	public Jackson2JsonDecoder(ObjectMapper mapper, MimeType... mimeTypes) {
		super(mapper, mimeTypes);
	}

	public Jackson2JsonDecoder(ObjectMapper mapper, List<MimeType> mimeTypes) {
		super(mapper, mimeTypes.toArray(new MimeType[]{}));
	}

}
