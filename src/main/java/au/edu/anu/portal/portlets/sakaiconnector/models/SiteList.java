/**
 * Copyright 2009-2013 The Australian National University
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package au.edu.anu.portal.portlets.sakaiconnector.models;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * A convenience object to hold a list of Sites retrieved from the web service call, when the XML is parsed.
 * Contains a single property, the list of Sites.
 * 
 * @author Steve Swinsburg (steve.swinsburg@anu.edu.au)
 *
 */

@NoArgsConstructor
@Data
@Root(name="list")
public class SiteList {

	@ElementList(name="item",inline=true)
	private List<Site> sites;
	
}
