package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PilcrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                lineTo(10.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                lineTo(7.0f,9.0f)
                curveTo(5.348383f,8.992614f,4.0133862f,7.6516337f,4.0133862f,6.0f)
                curveTo(4.0133862f,4.3483663f,5.348383f,3.0073862f,7.0f,3.0f)
                lineTo(15.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,3.0f)
                lineTo(14.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,14.0f)
                lineTo(22.0f,18.0f)
                lineTo(2.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,18.0f)
                lineTo(18.0f,22.0f)
            }
}

public val LucideIcons.All.PilcrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PilcrowRight: ImageVector
    @Composable get() = PilcrowRightDefinition.asImageVector()
