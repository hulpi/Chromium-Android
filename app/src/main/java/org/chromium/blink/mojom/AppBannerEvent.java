
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/public/platform/modules/app_banner/app_banner.mojom
//

package org.chromium.blink.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public interface AppBannerEvent extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends AppBannerEvent, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AppBannerEvent, AppBannerEvent.Proxy> MANAGER = AppBannerEvent_Internal.MANAGER;


    void bannerAccepted(
String platform);



    void bannerDismissed(
);


}
