package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(14.25f,9.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                curveTo(3.990385f,16.149986f,5.131871f,18.140781f,6.9922276f,19.21856f)
                curveTo(8.852584f,20.296337f,11.147416f,20.296337f,13.007772f,19.21856f)
                curveTo(14.868129f,18.140781f,16.009615f,16.149986f,16.0f,14.0f)
                curveTo(16.009615f,11.850015f,14.868129f,9.859219f,13.007772f,8.781441f)
                curveTo(11.147416f,7.7036624f,8.852584f,7.7036624f,6.9922276f,8.781441f)
                curveTo(5.131871f,9.859219f,3.990385f,11.850015f,4.0f,14.0f)
            }
}

public val LucideIcons.All.MarsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mars: ImageVector
    @Composable get() = MarsDefinition.asImageVector()
