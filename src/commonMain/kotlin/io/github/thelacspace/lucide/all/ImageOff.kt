package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImageOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.41f,10.41f)
                curveTo(9.90523f,10.919306f,9.1665325f,11.119601f,8.473622f,10.935043f)
                curveTo(7.7807126f,10.750485f,7.239515f,10.209287f,7.0549564f,9.516377f)
                curveTo(6.8703985f,8.823467f,7.070694f,8.08477f,7.58f,7.58f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5f,13.5f)
                lineTo(6.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(21.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.59f,3.59f)
                curveTo(3.213481f,3.962723f,3.0011322f,4.4702005f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(19.0f,21.0f)
                curveTo(19.55f,21.0f,20.052f,20.78f,20.41f,20.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,15.0f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(9.0f,3.0f)
            }
}

public val LucideIcons.All.ImageOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImageOff: ImageVector
    @Composable get() = ImageOffDefinition.asImageVector()
