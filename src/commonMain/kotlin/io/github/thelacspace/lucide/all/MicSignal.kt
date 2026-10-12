package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicSignal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,11.0)
                curveTo(18.000303268432617,8.856103897094727,16.85666847229004,6.874948024749756,15.0,5.802999973297119)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,11.0)
                curveTo(1.9993762969970703,7.42672061920166,3.905449151992798,4.124639987945557,7.0,2.3380002975463867)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,11.0)
                curveTo(22.00062370300293,7.42672061920166,20.09455108642578,4.124639987945557,17.0,2.3380002975463867)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,11.0)
                curveTo(5.999697208404541,8.856103897094727,7.143331050872803,6.874948024749756,9.0,5.802999973297119)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                lineTo(15.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,9.0)
                lineTo(12.0,9.0)
                lineTo(14.0,9.0)
                lineTo(14.0,17.0)
                lineTo(12.0,17.0)
                lineTo(12.0,17.0)
                lineTo(10.0,17.0)
                lineTo(10.0,9.0)
                lineTo(12.0,9.0)
                close()
            }
}

public val LucideIcons.All.MicSignalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicSignal: ImageVector
    @Composable get() = MicSignalDefinition.asImageVector()
