package com.robocafaz.rpg.common.constants.professions;

import com.robocafaz.rpg.common.constants.UserFacingConstant;
import com.robocafaz.rpg.common.constants.skills.SkillTree;
import com.robocafaz.rpg.common.constants.types.WeaponType;
import com.robocafaz.rpg.common.util.ProfessionUtil;

public class Profession extends UserFacingConstant
{
  private final ProfessionStatSettings professionStatSettings;
  private final SkillTree skillTree;
  private final WeaponType[] weaponTypes;

  protected Profession(String id, String name, String description, ProfessionStatSettings professionStatSettings,
      SkillTree skillTree)
  {
    super(id, name, description);
    this.skillTree = skillTree;
    this.professionStatSettings = professionStatSettings;
    this.weaponTypes = ProfessionUtil.getWeaponTypes(skillTree);
  }
}