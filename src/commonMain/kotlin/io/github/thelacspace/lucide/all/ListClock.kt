package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,13.0f)
                lineTo(16.0f,15.2f)
                lineTo(17.6f,16.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                lineTo(6.458f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                lineTo(6.832f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                curveTo(9.990385f,17.149986f,11.131871f,19.140781f,12.992228f,20.21856f)
                curveTo(14.852584f,21.296337f,17.147417f,21.296337f,19.007772f,20.21856f)
                curveTo(20.86813f,19.140781f,22.009615f,17.149986f,22.0f,15.0f)
                curveTo(22.009615f,12.850015f,20.86813f,10.859219f,19.007772f,9.781441f)
                curveTo(17.147417f,8.703663f,14.852584f,8.703663f,12.992228f,9.781441f)
                curveTo(11.131871f,10.859219f,9.990385f,12.850015f,10.0f,15.0f)
            }
}

public val LucideIcons.All.ListClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListClock: ImageVector
    @Composable get() = ListClockDefinition.asImageVector()
