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

import onespot.pivotal.api.resources.Story;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * creates the report in report.txt
 */
public class Report
{

    public void createReport(List<Story> stories, List<String> rules)
    {
        for (String rule: rules) {
            for (Story story:stories) {
                if(story.getLabels().get(0).name.equals(rule)) {
                    BufferedWriter writer = null;
                    try {
                        File report = new File("report.txt");
                        System.out.println(report.exists());

                        writer = new BufferedWriter(new FileWriter(report));
                        writer.write("jira ticket = " + story.getUrl() + "  rule =" + rule);
                        writer.flush();
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }


        }
    }
}

