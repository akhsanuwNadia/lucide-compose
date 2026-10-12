package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,12.0)
                lineTo(14.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.336999893188477,21.993999481201172)
                curveTo(8.151727676391602,22.134870529174805,4.321935176849365,19.653051376342773,2.740799903869629,15.775376319885254)
                curveTo(1.1596643924713135,11.89770221710205,2.162095785140991,7.445526599884033,5.2525634765625,4.619688987731934)
                curveTo(8.34303092956543,1.7938512563705444,12.866923332214355,1.1929094791412354,16.58795166015625,3.113926649093628)
                curveTo(20.308977127075195,5.0349440574646,22.43896484375,9.071017265319824,21.924999237060547,13.226999282836914)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,18.0)
                lineTo(18.0,22.0)
                lineTo(22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,14.0)
                lineTo(18.0,22.0)
            }
}

public val LucideIcons.All.ClockArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowDown: ImageVector
    @Composable get() = ClockArrowDownDefinition.asImageVector()
