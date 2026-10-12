package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitBranchPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,3.0f)
                lineTo(6.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,9.0f)
                curveTo(19.074993f,9.004807f,20.07039f,8.434065f,20.60928f,7.503886f)
                curveTo(21.148169f,6.573708f,21.148169f,5.426292f,20.60928f,4.496114f)
                curveTo(20.07039f,3.5659356f,19.074993f,2.9951925f,18.0f,3.0f)
                curveTo(16.348383f,3.0073862f,15.013387f,4.3483663f,15.013387f,6.0f)
                curveTo(15.013387f,7.6516337f,16.348383f,8.992614f,18.0f,9.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,21.0f)
                curveTo(7.0749927f,21.004808f,8.070391f,20.434065f,8.60928f,19.503887f)
                curveTo(9.148169f,18.573708f,9.148169f,17.426292f,8.60928f,16.496113f)
                curveTo(8.070391f,15.565935f,7.0749927f,14.995193f,6.0f,15.0f)
                curveTo(4.348383f,15.007386f,3.0133865f,16.348366f,3.0133865f,18.0f)
                curveTo(3.0133865f,19.651634f,4.348383f,20.992613f,6.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,6.0f)
                curveTo(10.029437f,6.0f,6.0f,10.029437f,6.0f,15.0f)
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

public val LucideIcons.All.GitBranchPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitBranchPlus: ImageVector
    @Composable get() = GitBranchPlusDefinition.asImageVector()
