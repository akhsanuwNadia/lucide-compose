package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Spotlight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.295000076293945,19.562000274658203)
                lineTo(16.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,16.0)
                lineTo(20.757999420166016,18.097999572753906)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,12.5)
                lineTo(22.0260009765625,11.902000427246094)
            }
            lucidePath(strokeWidth) {
                moveTo(7.610000133514404,6.300000190734863)
                curveTo(6.165544509887695,5.621819972991943,4.442968845367432,6.193082332611084,3.690000057220459,7.600000381469727)
                lineTo(2.309999942779541,10.390000343322754)
                curveTo(1.638204574584961,11.831869125366211,2.2085955142974854,13.547430038452148,3.609999895095825,14.300000190734863)
                lineTo(10.5,17.89699935913086)
                curveTo(10.737227439880371,18.015737533569336,11.011913299560547,18.03534698486328,11.263602256774902,17.951513290405273)
                curveTo(11.515291213989258,17.867677688598633,11.72335433959961,17.687273025512695,11.842000007629395,17.44999885559082)
                lineTo(14.947999954223633,11.238998413085938)
                curveTo(15.194586753845215,10.745235443115234,14.994526863098145,10.14505672454834,14.50100040435791,9.897998809814453)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,9.0)
                lineTo(8.0,2.0)
            }
}

public val LucideIcons.All.SpotlightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Spotlight: ImageVector
    @Composable get() = SpotlightDefinition.asImageVector()
