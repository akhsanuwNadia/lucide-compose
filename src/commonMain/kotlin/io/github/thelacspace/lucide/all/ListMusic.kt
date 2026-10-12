package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListMusic") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,5.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,12.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,19.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,16.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,16.0)
                curveTo(14.995192527770996,17.074993133544922,15.565935134887695,18.070390701293945,16.496112823486328,18.60927963256836)
                curveTo(17.426292419433594,19.148168563842773,18.573707580566406,19.148168563842773,19.503887176513672,18.60927963256836)
                curveTo(20.434064865112305,18.070390701293945,21.00480842590332,17.074993133544922,21.0,16.0)
                curveTo(21.00480842590332,14.925006866455078,20.434064865112305,13.929609298706055,19.503887176513672,13.39072036743164)
                curveTo(18.573707580566406,12.851831436157227,17.426292419433594,12.851831436157227,16.496112823486328,13.39072036743164)
                curveTo(15.565935134887695,13.929609298706055,14.995192527770996,14.925006866455078,15.0,16.0)
            }
}

public val LucideIcons.All.ListMusicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListMusic: ImageVector
    @Composable get() = ListMusicDefinition.asImageVector()
