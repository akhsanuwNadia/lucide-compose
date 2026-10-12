package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Apple") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.528f)
                lineTo(12.0f,3.0f)
                curveTo(12.0f,2.4477153f,12.447715f,2.0f,13.0f,2.0f)
                lineTo(13.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.237f,21.0f)
                curveTo(20.676231f,18.241535f,22.015602f,14.6822195f,22.0f,11.0f)
                curveTo(21.999947f,8.633917f,20.609367f,6.488807f,18.449429f,5.5228825f)
                curveTo(16.289488f,4.5569577f,13.763574f,4.9506116f,12.0f,6.528f)
                curveTo(10.236426f,4.9506116f,7.710511f,4.5569577f,5.5505724f,5.5228825f)
                curveTo(3.3906333f,6.488807f,2.0000536f,8.633917f,2.0f,11.0f)
                curveTo(1.9936903f,14.680543f,3.3318608f,18.23667f,5.763f,21.0f)
                curveTo(6.684403f,22.030807f,8.190958f,22.29842f,9.411f,21.648f)
                curveTo(11.029053f,20.784712f,12.970948f,20.784712f,14.589001f,21.648f)
                curveTo(15.809042f,22.298418f,17.315598f,22.030807f,18.237f,21.0f)
            }
}

public val LucideIcons.All.AppleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Apple: ImageVector
    @Composable get() = AppleDefinition.asImageVector()
