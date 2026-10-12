package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitPullRequestCreate") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,6.0f)
                curveTo(2.9951925f,7.0749927f,3.5659356f,8.070391f,4.496114f,8.60928f)
                curveTo(5.426292f,9.148169f,6.573708f,9.148169f,7.503886f,8.60928f)
                curveTo(8.434065f,8.070391f,9.004807f,7.0749927f,9.0f,6.0f)
                curveTo(9.004807f,4.9250073f,8.434065f,3.9296093f,7.503886f,3.3907204f)
                curveTo(6.573708f,2.8518312f,5.426292f,2.8518312f,4.496114f,3.3907204f)
                curveTo(3.5659356f,3.9296093f,2.9951925f,4.9250073f,3.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,9.0f)
                lineTo(6.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,6.0f)
                lineTo(16.0f,6.0f)
                curveTo(17.10457f,6.0f,18.0f,6.8954306f,18.0f,8.0f)
                lineTo(18.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,15.0f)
                lineTo(18.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,18.0f)
                lineTo(15.0f,18.0f)
            }
}

public val LucideIcons.All.GitPullRequestCreateDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitPullRequestCreate: ImageVector
    @Composable get() = GitPullRequestCreateDefinition.asImageVector()
