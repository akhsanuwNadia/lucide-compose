package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChefHat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                curveTo(17.552284f,21.0f,18.0f,20.552284f,18.0f,20.0f)
                lineTo(18.0f,14.65f)
                curveTo(18.0f,14.193f,18.316f,13.806f,18.727f,13.608999f)
                curveTo(20.483856f,12.770908f,21.382341f,10.789803f,20.855423f,8.915957f)
                curveTo(20.328503f,7.042111f,18.529179f,5.819621f,16.592999f,6.019999f)
                curveTo(15.803557f,4.184975f,13.99763f,2.9959424f,11.999998f,2.9959424f)
                curveTo(10.002367f,2.9959424f,8.19644f,4.184975f,7.4069986f,6.019999f)
                curveTo(5.4717464f,5.821031f,3.6739795f,7.0433f,3.1472852f,8.9161005f)
                curveTo(2.620591f,10.788901f,3.5177257f,12.769068f,5.272999f,13.607999f)
                curveTo(5.683999f,13.805999f,5.999999f,14.192999f,5.999999f,14.648999f)
                lineTo(5.999999f,20.0f)
                curveTo(5.999999f,20.552284f,6.4477143f,21.0f,6.999999f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,17.0f)
                lineTo(18.0f,17.0f)
            }
}

public val LucideIcons.All.ChefHatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChefHat: ImageVector
    @Composable get() = ChefHatDefinition.asImageVector()
