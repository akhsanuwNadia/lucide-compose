package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BugOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.656f,7.0f)
                lineTo(14.0f,7.0f)
                curveTo(16.209139f,7.0f,18.0f,8.790861f,18.0f,11.0f)
                lineTo(18.0f,12.344f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.12f,3.88f)
                lineTo(16.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.123f,17.123f)
                curveTo(15.7232685f,19.418926f,12.966956f,20.50322f,10.3780985f,19.776348f)
                curveTo(7.789242f,19.049475f,6.000126f,16.688963f,6.0f,14.0f)
                lineTo(6.0f,11.0f)
                curveTo(5.999862f,9.688631f,6.6425204f,8.460481f,7.7200003f,7.7130003f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,5.0f)
                curveTo(20.997658f,7.0332575f,19.470352f,8.74126f,17.45f,8.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,13.0f)
                lineTo(18.656f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                curveTo(2.997588f,18.862982f,4.675393f,17.101507f,6.81f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                curveTo(3.0023417f,7.0332575f,4.529649f,8.741261f,6.55f,8.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                lineTo(2.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(9.88f,3.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.712f,4.06f)
                curveTo(10.525824f,3.1003766f,11.852003f,2.7505622f,13.033265f,3.1839297f)
                curveTo(14.214526f,3.6172974f,14.999843f,4.7417526f,15.0f,6.0f)
                lineTo(15.0f,7.13f)
            }
}

public val LucideIcons.All.BugOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BugOff: ImageVector
    @Composable get() = BugOffDefinition.asImageVector()
