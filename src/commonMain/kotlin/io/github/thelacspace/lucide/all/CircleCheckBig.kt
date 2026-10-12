package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleCheckBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.801f,10.0f)
                curveTo(22.742088f,14.61852f,20.330347f,19.267159f,16.012516f,21.157318f)
                curveTo(11.694685f,23.04748f,6.643185f,21.66593f,3.8882775f,17.841423f)
                curveTo(1.1333698f,14.016915f,1.4230937f,8.78792f,4.5836515f,5.291172f)
                curveTo(7.7442093f,1.7944244f,12.917416f,0.9793956f,17.0f,3.335f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,11.0f)
                lineTo(12.0f,14.0f)
                lineTo(22.0f,4.0f)
            }
}

public val LucideIcons.All.CircleCheckBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleCheckBig: ImageVector
    @Composable get() = CircleCheckBigDefinition.asImageVector()
