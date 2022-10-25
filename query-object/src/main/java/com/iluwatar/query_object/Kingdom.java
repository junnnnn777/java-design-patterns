package com.iluwatar.query_object;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * Entity class of Kingdom with 2 attributes:
 *  - Kingdom's name
 *  - A list of battalions owned by the kingdom
 */
@RequiredArgsConstructor
@Getter
public class Kingdom {
    public final String kingdomName;
    public final List<Battalion> battalions;

}
