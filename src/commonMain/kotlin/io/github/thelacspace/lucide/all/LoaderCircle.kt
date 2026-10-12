package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LoaderCircle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                curveTo(20.99981f,15.898981f,18.489065f,19.354425f,14.780876f,20.559156f)
                curveTo(11.072685f,21.763887f,7.0104785f,20.44389f,4.7187643f,17.28951f)
                curveTo(2.4270504f,14.135134f,2.4270813f,9.863843f,4.718841f,6.709499f)
                curveTo(7.010601f,3.5551543f,11.072827f,2.2352145f,14.781f,3.4399996f)
            }
}

public val LucideIcons.All.LoaderCircleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LoaderCircle: ImageVector
    @Composable get() = LoaderCircleDefinition.asImageVector()
