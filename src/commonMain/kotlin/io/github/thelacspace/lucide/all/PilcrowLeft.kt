package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PilcrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,3.0f)
                lineTo(14.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,9.0f)
                lineTo(11.0f,9.0f)
                curveTo(9.348383f,8.992614f,8.013387f,7.6516337f,8.013387f,6.0f)
                curveTo(8.013387f,4.3483663f,9.348383f,3.0073862f,11.0f,3.0f)
                lineTo(20.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,3.0f)
                lineTo(18.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,18.0f)
                lineTo(2.0f,18.0f)
                lineTo(6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,22.0f)
                lineTo(2.0f,18.0f)
            }
}

public val LucideIcons.All.PilcrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PilcrowLeft: ImageVector
    @Composable get() = PilcrowLeftDefinition.asImageVector()
