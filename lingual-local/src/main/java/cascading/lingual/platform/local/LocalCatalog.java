/*
 * Copyright (c) 2007-2012 Concurrent, Inc. All Rights Reserved.
 *
 * Project and contact information: http://www.cascading.org/
 *
 * This file is part of the Cascading project.
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

package cascading.lingual.platform.local;

import java.util.Collections;
import java.util.List;

import cascading.bind.catalog.handler.SchemeHandler;
import cascading.bind.catalog.handler.TapHandler;
import cascading.lingual.catalog.Format;
import cascading.lingual.catalog.Protocol;
import cascading.lingual.catalog.SchemaCatalog;

/**
 *
 */
public class LocalCatalog extends SchemaCatalog
  {
  public LocalCatalog()
    {
    }

  @Override
  protected List<TapHandler<Protocol, Format>> createTapHandlers()
    {
    return Collections.<TapHandler<Protocol, Format>>singletonList( new LocalDefaultTapFactory() );
    }

  @Override
  protected List<SchemeHandler<Protocol, Format>> createSchemeHandlers()
    {
    return Collections.<SchemeHandler<Protocol, Format>>singletonList( new LocalDefaultSchemeFactory() );
    }
  }
