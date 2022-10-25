package com.iluwatar.query_object;


import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * Entity class of Battalion with 1 attribute:
 * - A list of soldiers that are serving
 */
@RequiredArgsConstructor
public class Battalion {
    public final List<Soldier> soldiers;
}
