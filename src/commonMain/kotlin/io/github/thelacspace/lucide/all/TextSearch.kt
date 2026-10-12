package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,5.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,19.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,15.0)
                curveTo(13.995192527770996,16.074993133544922,14.565935134887695,17.070390701293945,15.496113777160645,17.60927963256836)
                curveTo(16.426292419433594,18.148168563842773,17.573707580566406,18.148168563842773,18.503887176513672,17.60927963256836)
                curveTo(19.434064865112305,17.070390701293945,20.00480842590332,16.074993133544922,20.0,15.0)
                curveTo(20.00480842590332,13.925006866455078,19.434064865112305,12.929609298706055,18.503887176513672,12.39072036743164)
                curveTo(17.573707580566406,11.851831436157227,16.426292419433594,11.851831436157227,15.496113777160645,12.39072036743164)
                curveTo(14.565935134887695,12.929609298706055,13.995192527770996,13.925006866455078,14.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,19.0)
                lineTo(19.100000381469727,17.100000381469727)
            }
}

public val LucideIcons.All.TextSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextSearch: ImageVector
    @Composable get() = TextSearchDefinition.asImageVector()
