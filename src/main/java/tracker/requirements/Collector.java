package tracker.requirements;

/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import onespot.pivotal.api.PivotalTracker;
import onespot.pivotal.api.resources.Story;

import java.util.List;

/**
 * collects requirements from pivotal
 */
public class Collector {

    private int PROJECT_ID = 2352861;
    private String PIVOTAL_API_TOKEN = "e5961bd616a2a81f6bdefa2cb71558b7";
    public List<Story> collectRequirements()
    {
        PivotalTracker pivotalTracker = new PivotalTracker(PIVOTAL_API_TOKEN);

        List<Story> stories = pivotalTracker.projects().id(PROJECT_ID)
                .stories()
                .getAll();
        return stories;
    }
}
