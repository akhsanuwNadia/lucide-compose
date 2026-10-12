package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plug2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(9.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,2.0f)
                lineTo(15.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                lineTo(19.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,11.0f)
                lineTo(6.0f,8.0f)
                lineTo(18.0f,8.0f)
                lineTo(18.0f,11.0f)
                curveTo(18.009615f,13.149985f,16.86813f,15.140781f,15.007772f,16.21856f)
                curveTo(13.147416f,17.296337f,10.852584f,17.296337f,8.992228f,16.21856f)
                curveTo(7.131871f,15.140781f,5.990385f,13.149985f,6.0f,11.0f)
                close()
            }
}

public val LucideIcons.All.Plug2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plug2: ImageVector
    @Composable get() = Plug2Definition.asImageVector()
