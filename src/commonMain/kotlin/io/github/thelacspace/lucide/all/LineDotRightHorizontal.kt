package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineDotRightHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(15.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                curveTo(14.995192527770996,13.074993133544922,15.565935134887695,14.070390701293945,16.496112823486328,14.60927963256836)
                curveTo(17.426292419433594,15.148168563842773,18.573707580566406,15.148168563842773,19.503887176513672,14.60927963256836)
                curveTo(20.434064865112305,14.070390701293945,21.00480842590332,13.074993133544922,21.0,12.0)
                curveTo(21.00480842590332,10.925006866455078,20.434064865112305,9.929609298706055,19.503887176513672,9.39072036743164)
                curveTo(18.573707580566406,8.851831436157227,17.426292419433594,8.851831436157227,16.496112823486328,9.39072036743164)
                curveTo(15.565935134887695,9.929609298706055,14.995192527770996,10.925006866455078,15.0,12.0)
            }
}

public val LucideIcons.All.LineDotRightHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineDotRightHorizontal: ImageVector
    @Composable get() = LineDotRightHorizontalDefinition.asImageVector()
