/**
 *
 * Copyright 2006 David Blevins
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.codehaus.swizzle.jira;

import java.util.Map;
import java.util.HashMap;
import java.util.Date;

/**
 * @version $Revision$ $Date$
 */
public class Version extends MapObject {

    public Version(Map data) {
        super(data);
    }

    public Version(){
        this(new HashMap());
    }

    /**
     * the id of the version
     */
    public int getId() {
        return getInt("id");
    }

    public void setId(int id) {
        setInt("id", id);
    }

    /**
     * the name of the version
     */
    public String getName() {
        return getString("name");
    }

    public void setName(String name) {
        setString("name", name);
    }

    /**
     * whether or not this version is released
     */
    public boolean getReleased() {
        return getBoolean("released");
    }

    public void setReleased(boolean released) {
        setBoolean("released", released);
    }

    /**
     * whether or not this version is archived
     */
    public boolean getArchived() {
        return getBoolean("archived");
    }

    public void setArchived(boolean archived) {
        setBoolean("archived", archived);
    }

    public Date getReleaseDate() {
        return getDate("releaseDate");
    }

    public void setReleaseDate(Date releaseDate) {
        setDate("releaseDate", releaseDate);
    }

    public int getSequence() {
        return getInt("sequence");
    }

    public void setSequence(int sequence) {
        setInt("sequence", sequence);
    }

    public String toString() {
        String name = getName();
        int id = getId();
        return (name != null)? name : id+"";
    }
}
