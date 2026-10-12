package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,11.692999839782715)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(20.125,20.125)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.000483989715576,13.617424011230469,6.84747838973999,14.943547248840332,11.696999549865723,14.998000144958496)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(2.9996323585510254,19.811914443969727,3.986539363861084,20.589208602905273,5.735328197479248,21.154361724853516)
                curveTo(7.484117031097412,21.719514846801758,9.845436096191406,22.024259567260742,12.279999732971191,21.999000549316406)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                curveTo(14.995192527770996,19.074993133544922,15.565935134887695,20.070390701293945,16.496112823486328,20.60927963256836)
                curveTo(17.426292419433594,21.148168563842773,18.573707580566406,21.148168563842773,19.503887176513672,20.60927963256836)
                curveTo(20.434064865112305,20.070390701293945,21.00480842590332,19.074993133544922,21.0,18.0)
                curveTo(21.00480842590332,16.925006866455078,20.434064865112305,15.929609298706055,19.503887176513672,15.39072036743164)
                curveTo(18.573707580566406,14.851831436157227,17.426292419433594,14.851831436157227,16.496112823486328,15.39072036743164)
                curveTo(15.565935134887695,15.929609298706055,14.995192527770996,16.925006866455078,15.0,18.0)
            }
}

public val LucideIcons.All.DatabaseSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseSearch: ImageVector
    @Composable get() = DatabaseSearchDefinition.asImageVector()
