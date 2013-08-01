package com.robocafaz.rpg.common.constants.types;

import com.robocafaz.rpg.common.constants.UserFacingConstant;
import com.robocafaz.rpg.common.constants.skills.SkillRange;

public class WeaponType extends UserFacingConstant implements Expertise {
  private final SkillRange skillRange;

  WeaponType(String id, String name, String description, SkillRange skillRange) {
    super(id, name, description);
    this.skillRange = skillRange;
  }

  public SkillRange getSkillRange() {
    return this.skillRange;
  }
}
