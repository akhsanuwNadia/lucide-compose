package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.00157f,7.3599424f,19.747406f,6.745774f,19.294f,6.294f)
                lineTo(15.706f,2.706f)
                curveTo(15.254227f,2.2525938f,14.640058f,1.9984303f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,6.85f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,14.0f)
                lineTo(8.0f,16.2f)
                lineTo(9.6f,17.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                curveTo(1.9903849f,18.149986f,3.131871f,20.140781f,4.9922276f,21.21856f)
                curveTo(6.8525834f,22.296337f,9.147416f,22.296337f,11.007772f,21.21856f)
                curveTo(12.868129f,20.140781f,14.009615f,18.149986f,14.0f,16.0f)
                curveTo(14.009615f,13.850015f,12.868129f,11.859219f,11.007772f,10.781441f)
                curveTo(9.147416f,9.703663f,6.8525834f,9.703663f,4.9922276f,10.781441f)
                curveTo(3.131871f,11.859219f,1.9903849f,13.850015f,2.0f,16.0f)
            }
}

public val LucideIcons.All.FileClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileClock: ImageVector
    @Composable get() = FileClockDefinition.asImageVector()
