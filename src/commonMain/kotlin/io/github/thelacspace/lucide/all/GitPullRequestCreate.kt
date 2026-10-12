package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitPullRequestCreate") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,6.0)
                curveTo(2.995192527770996,7.074992656707764,3.5659356117248535,8.070390701293945,4.4961137771606445,8.60927963256836)
                curveTo(5.4262919425964355,9.148168563842773,6.5737080574035645,9.148168563842773,7.5038862228393555,8.60927963256836)
                curveTo(8.434064865112305,8.070390701293945,9.004807472229004,7.074992656707764,9.0,6.0)
                curveTo(9.004807472229004,4.925007343292236,8.434064865112305,3.9296092987060547,7.5038862228393555,3.3907203674316406)
                curveTo(6.5737080574035645,2.8518311977386475,5.4262919425964355,2.8518311977386475,4.4961137771606445,3.3907203674316406)
                curveTo(3.5659356117248535,3.9296092987060547,2.995192527770996,4.925007343292236,3.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,9.0)
                lineTo(6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,6.0)
                lineTo(16.0,6.0)
                curveTo(17.104570388793945,6.0,18.0,6.895430564880371,18.0,8.0)
                lineTo(18.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,15.0)
                lineTo(18.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,18.0)
                lineTo(15.0,18.0)
            }
}

public val LucideIcons.All.GitPullRequestCreateDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitPullRequestCreate: ImageVector
    @Composable get() = GitPullRequestCreateDefinition.asImageVector()
