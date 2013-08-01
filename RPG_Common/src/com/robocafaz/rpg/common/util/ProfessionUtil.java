package com.robocafaz.rpg.common.util;

import java.util.HashSet;
import java.util.Set;
import com.robocafaz.rpg.common.constants.skills.ExpertiseRequirement;
import com.robocafaz.rpg.common.constants.skills.SkillRequirement;
import com.robocafaz.rpg.common.constants.skills.SkillTree;
import com.robocafaz.rpg.common.constants.types.Expertise;
import com.robocafaz.rpg.common.constants.types.WeaponType;

public class ProfessionUtil
{
  public static WeaponType[] getWeaponTypes(SkillTree skillTree)
  {
    Set<WeaponType> weaponTypes = new HashSet<WeaponType>();
    for (SkillRequirement skillRequirement : skillTree.getSkillRequirements())
    {
      for (ExpertiseRequirement expertiseRequirement : skillRequirement.getExpertiseRequirements())
      {
        Expertise expertise = expertiseRequirement.getExpertise();
        if (expertise instanceof WeaponType)
        {
          weaponTypes.add((WeaponType) expertise);
        }
      }
    }
    return weaponTypes.toArray(new WeaponType[0]);
  }
}
