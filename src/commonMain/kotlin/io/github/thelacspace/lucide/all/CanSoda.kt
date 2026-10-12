package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CanSoda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,22.0)
                lineTo(18.663999557495117,19.503999710083008)
                curveTo(18.8831729888916,19.17530632019043,19.00008773803711,18.789064407348633,19.0,18.393999099731445)
                lineTo(19.0,5.605999946594238)
                curveTo(19.00008773803711,5.210935115814209,18.88317108154297,4.82469367980957,18.663999557495117,4.495999813079834)
                lineTo(17.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(6.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,2.0)
                lineTo(6.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,17.0)
                lineTo(19.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,7.0)
                lineTo(19.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(5.335999965667725,19.503999710083008)
                curveTo(5.116827487945557,19.17530632019043,4.999911308288574,18.789064407348633,5.0,18.393999099731445)
                lineTo(5.0,5.605999946594238)
                curveTo(4.999911308288574,5.210935115814209,5.116827487945557,4.82469367980957,5.335999965667725,4.495999813079834)
                lineTo(7.0,2.0)
            }
}

public val LucideIcons.All.CanSodaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CanSoda: ImageVector
    @Composable get() = CanSodaDefinition.asImageVector()
