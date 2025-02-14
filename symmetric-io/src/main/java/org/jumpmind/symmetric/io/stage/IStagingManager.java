/**
 * Licensed to JumpMind Inc under one or more contributor
 * license agreements.  See the NOTICE file distributed
 * with this work for additional information regarding
 * copyright ownership.  JumpMind Inc licenses this file
 * to you under the GNU General Public License, version 3.0 (GPLv3)
 * (the "License"); you may not use this file except in compliance
 * with the License.
 *
 * You should have received a copy of the GNU General Public License,
 * version 3.0 (GPLv3) along with this library; if not, see
 * <http://www.gnu.org/licenses/>.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jumpmind.symmetric.io.stage;

import java.io.File;
import java.util.Set;

public interface IStagingManager {

    public IStagedResource find(Object... path);
    
    public IStagedResource find(String path);

    public IStagedResource create(Object... path);
    
    public long clean(long timeToLiveInMs);
    
    public Set<String> getResourceReferences();

    public StagingFileLock acquireFileLock(String serverInfo, Object... path);

    public File getStagingDirectory();
}
