package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MarsStroke") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,6.0f)
                lineTo(18.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(13.25f,10.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,15.0f)
                curveTo(2.990385f,17.149986f,4.131871f,19.140781f,5.9922276f,20.21856f)
                curveTo(7.8525834f,21.296337f,10.147416f,21.296337f,12.007772f,20.21856f)
                curveTo(13.868129f,19.140781f,15.009615f,17.149986f,15.0f,15.0f)
                curveTo(15.009615f,12.850015f,13.868129f,10.859219f,12.007772f,9.781441f)
                curveTo(10.147416f,8.703663f,7.8525834f,8.703663f,5.9922276f,9.781441f)
                curveTo(4.131871f,10.859219f,2.990385f,12.850015f,3.0f,15.0f)
            }
}

public val LucideIcons.All.MarsStrokeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MarsStroke: ImageVector
    @Composable get() = MarsStrokeDefinition.asImageVector()
