package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bath") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,4.0)
                lineTo(8.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,19.0)
                lineTo(17.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,19.0)
                lineTo(7.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,5.0)
                lineTo(7.620999813079834,3.621000051498413)
                curveTo(7.030213356018066,3.0274689197540283,6.14550256729126,2.837122678756714,5.362893104553223,3.135166883468628)
                curveTo(4.5802836418151855,3.433211326599121,4.046311378479004,4.163840293884277,4.0,5.0)
                lineTo(4.0,17.0)
                curveTo(4.0,18.104570388793945,4.895430564880371,19.0,6.0,19.0)
                lineTo(18.0,19.0)
                curveTo(19.104570388793945,19.0,20.0,18.104570388793945,20.0,17.0)
                lineTo(20.0,12.0)
            }
}

public val LucideIcons.All.BathDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bath: ImageVector
    @Composable get() = BathDefinition.asImageVector()
