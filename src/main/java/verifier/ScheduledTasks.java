/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package verifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import verifier.entity.Item;
import verifier.service.ConfigService;
import verifier.thirdparty.AbstractApiService;
import verifier.thirdparty.DataReaderService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private DataReaderService dataReaderService;

    @Autowired
    private ConfigService configService;

    @Autowired
    private List<AbstractApiService> apiServices;

    @Scheduled(fixedRate = 5000)
    public void verifyItems() {
        log.info("Start archiver verify {}", dateFormat.format(new Date()));

        List<Item> items = dataReaderService.readItems();
        for (AbstractApiService apiService : apiServices) {
            for (Item item : items) {
//                if (apiService.getStorageType().equals(item.get())) {
//                    apiService.doVerify(item);
//                }
            }
        }
        long count = configService.count();
        log.info("{}", count);
        log.info("End archiver verify {}", dateFormat.format(new Date()));
    }

}
