package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCwFadingClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                curveTo(14.516048431396484,3.009464979171753,16.9310302734375,3.9912235736846924,18.739999771118164,5.739999771118164)
            }
            lucidePath(strokeWidth) {
                moveTo(18.739999771118164,5.739999771118164)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(21.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,19.79400062561035)
                curveTo(1.5,16.329999923706055,1.5,7.670001029968262,7.5,4.206000328063965)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,4.205999851226807)
                curveTo(8.86815071105957,3.4160051345825195,10.420148849487305,3.0000693798065186,12.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,12.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,20.774999618530273)
                curveTo(13.343842506408691,20.92453956604004,12.672982215881348,21.000011444091797,12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,17.6560001373291)
                curveTo(18.558252334594727,18.19795036315918,18.054859161376953,18.68657875061035,17.5,19.11199951171875)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                curveTo(20.999027252197266,12.673094749450684,20.922548294067383,13.34395694732666,20.77199935913086,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(16.0,8.0)
            }
}

public val LucideIcons.All.RotateCwFadingClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCwFadingClock: ImageVector
    @Composable get() = RotateCwFadingClockDefinition.asImageVector()
