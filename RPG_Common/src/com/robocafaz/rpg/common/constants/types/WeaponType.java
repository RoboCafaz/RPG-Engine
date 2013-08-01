package com.robocafaz.rpg.common.constants.types;

import com.robocafaz.rpg.common.constants.UserFacingConstant;
import com.robocafaz.rpg.common.constants.skills.SkillRange;
import com.robocafaz.rpg.common.handlers.ConstantHandler;

public class WeaponType extends UserFacingConstant implements Expertise
{
  private final SkillRange skillRange;

  public WeaponType(String id, String name, String description, String skillRangeId)
  {
    super(id, name, description);
    this.skillRange = (SkillRange) ConstantHandler.get(skillRangeId);
  }

  public SkillRange getSkillRange()
  {
    return this.skillRange;
  }
}
