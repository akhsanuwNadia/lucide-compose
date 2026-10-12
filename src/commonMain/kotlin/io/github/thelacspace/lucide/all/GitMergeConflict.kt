package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitMergeConflict") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(16.0,6.0)
                curveTo(17.104570388793945,6.0,18.0,6.895430564880371,18.0,8.0)
                lineTo(18.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,3.5)
                lineTo(3.5,8.5)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,8.5)
                lineTo(3.5,3.5)
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

public val LucideIcons.All.GitMergeConflictDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitMergeConflict: ImageVector
    @Composable get() = GitMergeConflictDefinition.asImageVector()
