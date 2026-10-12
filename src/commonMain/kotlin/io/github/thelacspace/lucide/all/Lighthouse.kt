package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lighthouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.06599998474121,16.864999771118164)
                lineTo(7.0,22.0)
                lineTo(9.0,11.0)
                lineTo(9.0,6.0)
                curveTo(9.007386207580566,4.348382949829102,10.348365783691406,3.0133864879608154,12.0,3.0133864879608154)
                curveTo(13.651634216308594,3.0133864879608154,14.992613792419434,4.348382949829102,15.0,6.0)
                lineTo(15.0,11.0)
                lineTo(17.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.79199981689453,4.5)
                lineTo(20.65799903869629,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.797000885009766,13.5)
                lineTo(20.663000106811523,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,9.0)
                lineTo(22.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(2.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.203000068664551,13.5)
                lineTo(3.3370001316070557,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.208000183105469,4.5)
                lineTo(3.3420000076293945,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.5,22.0)
                lineTo(18.5,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.932000160217285,16.875)
                lineTo(15.309000015258789,12.697000503540039)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,11.0)
                lineTo(16.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,7.0)
                lineTo(16.0,7.0)
            }
}

public val LucideIcons.All.LighthouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lighthouse: ImageVector
    @Composable get() = LighthouseDefinition.asImageVector()
