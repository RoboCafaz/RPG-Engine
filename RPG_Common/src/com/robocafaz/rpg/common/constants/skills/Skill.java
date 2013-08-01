package com.robocafaz.rpg.common.constants.skills;

import com.robocafaz.rpg.common.constants.UserFacingConstant;
import com.robocafaz.rpg.common.constants.types.BattleEffect;

public class Skill extends UserFacingConstant
{
  private final BattleEffect battleEffect;
  private final SkillType skillType;
  private final SkillTarget skillTarget;
  private final SkillArea skillArea;
  private final SkillRange skillRange;
  private final int cost;
  private final double effectCoefficient;
  private final double castCoefficient;

  protected Skill(String id, String name, String description, BattleEffect battleEffect, SkillType skillType,
      SkillTarget skillTarget, SkillArea skillArea, SkillRange skillRange, int cost, double effectCoefficient,
      double castCoefficient)
  {
    super(id, name, description);
    this.battleEffect = battleEffect;
    this.skillType = skillType;
    this.skillTarget = skillTarget;
    this.skillArea = skillArea;
    this.skillRange = skillRange;
    this.cost = cost;
    this.effectCoefficient = effectCoefficient;
    this.castCoefficient = castCoefficient;
  }

  public BattleEffect getBattleEffect()
  {
    return this.battleEffect;
  }

  public SkillType getSkillType()
  {
    return this.skillType;
  }

  public SkillTarget getSkillTarget()
  {
    return this.skillTarget;
  }

  public SkillArea getSkillArea()
  {
    return this.skillArea;
  }

  public SkillRange getSkillRange()
  {
    return this.skillRange;
  }

  public int getCost()
  {
    return this.cost;
  }

  public double getEffectCoefficient()
  {
    return this.effectCoefficient;
  }

  public double getCastCoefficient()
  {
    return this.castCoefficient;
  }

}
