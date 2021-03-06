
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/public/platform/modules/permissions/permission.mojom
//

package org.chromium.blink.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;

public final class PermissionName {


    public static final int GEOLOCATION = 0;

    public static final int NOTIFICATIONS = GEOLOCATION + 1;

    public static final int PUSH_NOTIFICATIONS = NOTIFICATIONS + 1;

    public static final int MIDI = PUSH_NOTIFICATIONS + 1;

    public static final int PROTECTED_MEDIA_IDENTIFIER = MIDI + 1;

    public static final int DURABLE_STORAGE = PROTECTED_MEDIA_IDENTIFIER + 1;

    public static final int AUDIO_CAPTURE = DURABLE_STORAGE + 1;

    public static final int VIDEO_CAPTURE = AUDIO_CAPTURE + 1;

    public static final int BACKGROUND_SYNC = VIDEO_CAPTURE + 1;


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private PermissionName() {}

}