/*
 * Copyright 2011, Mysema Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mysema.query._sqlite;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

import com.mysema.query.Connections;
import com.mysema.query.SelectBaseTest;
import com.mysema.query.Target;
import com.mysema.query.sql.SQLiteTemplates;
import com.mysema.testutil.Label;

@Ignore // work in progress
@Label(Target.SQLITE)
public class SelectSQLiteTest extends SelectBaseTest {

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initSQLite();
    }

    @Before
    public void setUpForTest() {
        templates = new SQLiteTemplates(){{
            newLineToSingleSpace();
        }};
    }

}
