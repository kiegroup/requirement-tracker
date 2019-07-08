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

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Uses the rules to filter the credit requests
 */
public class Filter {

    public KieBase loadRules() {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        return kieContainer.getKieBase();
    }

    public List<String> executeDroolsRules(KieBase base, Transaction t)
    {
        KieSession ksession = base.newKieSession();
        ksession.insert(t);
        ksession.fireAllRules();
        System.out.println(t.getRuleName());
        List<String> rulesList = new ArrayList<>();
        rulesList.add(t.getRuleName());
        return rulesList;
    }
}
