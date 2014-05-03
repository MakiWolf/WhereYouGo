/*
 * This file is part of WhereYouGo.
 * 
 * WhereYouGo is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * WhereYouGo is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with WhereYouGo. If not,
 * see <http://www.gnu.org/licenses/>.
 * 
 * Copyright (C) 2012 Menion <whereyougo@asamm.cz>
 */

package menion.android.whereyougo.guiding;

import locus.api.objects.extra.Location;
import locus.api.objects.extra.Waypoint;

/**
 * @author menion
 * @since 25.1.2010 2010
 */
public interface Guide {

  public void actualizeState(Location actualLocation);

  public Waypoint getActualTarget();

  public String getTargetName();

  public float getAzimuthToTaget();

  public float getDistanceToTarget();

  public long getTimeToTarget();

  public void manageDistanceSoundsBeeping(double distance);
}