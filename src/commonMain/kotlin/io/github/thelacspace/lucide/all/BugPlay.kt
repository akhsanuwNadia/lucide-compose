package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BugPlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,19.655f)
                curveTo(7.6033626f,18.807661f,6.0007854f,16.542017f,6.0f,14.0f)
                lineTo(6.0f,11.0f)
                curveTo(6.0f,8.790861f,7.790861f,7.0f,10.0f,7.0f)
                lineTo(14.0f,7.0f)
                curveTo(16.197475f,6.999938f,17.983519f,8.772586f,18.0f,10.97f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.003f)
                curveTo(13.99891f,14.641666f,14.192832f,14.307848f,14.507257f,14.129805f)
                curveTo(14.821684f,13.951761f,15.207704f,13.957188f,15.517f,14.144f)
                lineTo(20.514f,17.141f)
                curveTo(20.816635f,17.321375f,21.002026f,17.647692f,21.002026f,18.0f)
                curveTo(21.002026f,18.35231f,20.816635f,18.678627f,20.514f,18.859001f)
                lineTo(15.517f,21.856f)
                curveTo(15.20755f,22.042908f,14.821314f,22.048243f,14.50682f,21.869953f)
                curveTo(14.192326f,21.691664f,13.998547f,21.357513f,14.0f,20.996f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.12f,3.88f)
                lineTo(16.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,5.0f)
                curveTo(20.997658f,7.0332575f,19.470352f,8.74126f,17.45f,8.97f)
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
                moveTo(9.0f,7.13f)
                lineTo(9.0f,6.0f)
                curveTo(8.995193f,4.9250073f,9.565935f,3.9296093f,10.496114f,3.3907204f)
                curveTo(11.426291f,2.8518312f,12.573709f,2.8518312f,13.503886f,3.3907204f)
                curveTo(14.434065f,3.9296093f,15.004807f,4.9250073f,15.0f,6.0f)
                lineTo(15.0f,7.13f)
            }
}

public val LucideIcons.All.BugPlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BugPlay: ImageVector
    @Composable get() = BugPlayDefinition.asImageVector()
